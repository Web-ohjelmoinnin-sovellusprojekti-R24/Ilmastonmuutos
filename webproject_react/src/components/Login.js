import React from "react";
import {Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Form, Col, Row, Container} from 'react-bootstrap';


export default function Login() {
return (
    <div>
        <h1>History Of Climate Changes</h1>
        <Form>
           <Form.Group>
            <Form.Label>Username</Form.Label>
            <Form.Control type="email" placeholder="Example@email.com"/>
            </Form.Group> 
            <Form.Group>
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" placeholder="********"/>
            </Form.Group> 
        </Form>
        <Link to="/v1"><Button>Login</Button></Link>
        <div>
            <p className='text1'>Don't have an account? Create one!</p>
        </div>
    </div>

    
)
}