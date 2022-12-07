import React from "react";
import {Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Form, Col, Row, Container} from 'react-bootstrap';


export default function Login() {
return (
    <div>
        <h1 className="title">History Of Climate Changes</h1>
        <Form>
           <Form.Group>
            <Form.Label>Username</Form.Label>
            <Form.Control type="username" placeholder="Example1234"/>
            </Form.Group> 
            <Form.Group>
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" placeholder="********"/>
            </Form.Group> 
        </Form>
        <div class="text-center">
        <Link to="/v1"><Button className="loginbtn">Login</Button></Link>
        </div>
        
        <div>
            <p className="loginpagetext">Don't have an account? <br />Create one!</p>
        </div>
    </div>

    
)
}