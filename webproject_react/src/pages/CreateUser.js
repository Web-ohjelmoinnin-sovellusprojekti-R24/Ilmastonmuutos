import React, { useState } from "react";
import { Button, Form, Col, Row, Container } from 'react-bootstrap';
import axios from "axios";
import { useNavigate } from "react-router-dom";


export default function CreateUser() {

    const URL = "http://localhost:8080/register";
    const [user, setUser] = useState("");
    const [pass, setPass] = useState("");
    const [successMessage, setSuccessMessage] = useState("");
    const navigate = useNavigate();

    function Validate() {
        return user.length > 0 && pass.length > 0;
    }

    function handleSubmit(event) {
        axios.post(URL, {
        },
            {
                params: {
                    username: user,
                    password: pass
                },
            }
        )
            .then(function (response) {
                console.log(response);
                if(response.status == 200){
                    setSuccessMessage("User created successfully!");
                }
                //navigate('/Login');
            })
            .catch(function (error) {
                console.log(error);
            })
        event.preventDefault();
    }
    return (
        <div>
            <Form onSubmit={handleSubmit}>
                <Form.Group>
                    <Form.Label className="createusertext">Create user</Form.Label>
                    <Form.Control type="username" placeholder="Example1234" autoFocus value={user} onChange={(e) => setUser(e.target.value)} />
                </Form.Group>
                <Form.Group>
                    <Form.Label></Form.Label>
                    <Form.Control type="password" placeholder="*****" autoFocus value={pass} onChange={(e) => setPass(e.target.value)} />
                </Form.Group>
            </Form>

            <div class="text-center">
                <Button className="createbtn" type="submit" disabled={!Validate()} onClick={handleSubmit}>Create account</Button>
            </div>
            <div>
                <p className="loginpagetext">{successMessage}</p>
            </div>
        </div>
    )
}