import React, { useState } from "react";
import {Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Form, Col, Row, Container} from 'react-bootstrap';
import {useNavigate} from 'react-router-dom';


import axios from "axios";


export default function Login() {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const navigate = useNavigate();

    function Validate(){
        return username.length > 0 && password.length > 0;
    }
    

    function handleSubmit(event) {
    const post = axios.post('http://localhost:8080/login',{
            username: username,
            password: password
        })
        event.preventDefault();
    }
return (
    <div>
        <h1 className="title">History Of Climate Changes</h1>
        <Form onSubmit={handleSubmit}>
           <Form.Group>
            <Form.Label>Username</Form.Label>
            <Form.Control type="username" placeholder="Example1234" autoFocus value={username} onChange={(e)=>setUsername(e.target.value)}/>
            </Form.Group> 
            <Form.Group>
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" placeholder="********" value={password} onChange={(e)=> setPassword(e.target.value)}/>
            </Form.Group> 
        </Form>
        <div class="text-center">
        <Button className="loginbtn" type="submit" disabled={!Validate()}>Login</Button>
        </div>
        
        <div>
            <p className="loginpagetext">Don't have an account? <Link to ="/CreateUser">Create one!</Link></p>
        </div>
    </div>

    
)
}