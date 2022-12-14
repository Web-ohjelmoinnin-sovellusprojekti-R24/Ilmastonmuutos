import axios from "axios";
import React, { useState } from "react";
import {Button, Form, Col, Row, Container} from 'react-bootstrap';


export default function Settings() {

    const URL = "http://localhost:8080/delete";
    const [user, setUser] = useState("");
    const [pass, setPass] = useState("");
    const [successMessage, setSuccessMessage] = useState("");

    //funktio, joka lähettää backendille poistettavan käyttäjän tiedot
    function handleSubmit(event){
        axios.delete(`http://localhost:8080/delete/`+user+"/"+pass)
        //response, joka kertoo että käyttäjä on poistettu onnistuneesti       
    .then(function (response) {
        console.log(response);
        if(response.status == 200){
            setSuccessMessage("User deleted!");
        }
    })
    .catch(function (error) {
        console.log(error);
    })
    event.preventDefault();
    }


    //form joka lähettää handleSubmit-funktiolle käyttäjän tiedot
return (
    <div>
       <Form>
           <Form.Group>
            <Form.Label className="deleteusertext">Delete user</Form.Label>
            <Form.Control type="username" placeholder="Example1234" autoFocus value={user} onChange={(e) => setUser(e.target.value)}/>
            </Form.Group> 
            <Form.Group>
            <Form.Label></Form.Label>
            <Form.Control type="password" placeholder="********" autoFocus value={pass} onChange={(e) => setPass(e.target.value)}/>
            </Form.Group>
        </Form>

        <div class= "text-center">
            <Button className="deleteuserbtn" type="submit" onClick={handleSubmit}>DELETE USER</Button>
        </div>
        <div>
            <p className="loginpagetext">{successMessage}</p>
        </div>
    </div>
)
}