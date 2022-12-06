import React from "react";
import {Button, Form, Col, Row, Container} from 'react-bootstrap';


export default function CreateUser() {
return (
    <div>
       <Form>
           <Form.Group>
            <Form.Label className="createusertext">Create user</Form.Label>
            <Form.Control type="username" placeholder="Example1234"/>
            </Form.Group> 
            <Form.Group>
            <Form.Label></Form.Label>
            <Form.Control type="password" placeholder="********"/>
            </Form.Group> 
            <Form.Group>
            <Form.Label></Form.Label>
            <Form.Control type="new password" placeholder="********"/>
            </Form.Group> 
        </Form>

        <div>
            <Button className="createbtn">Create account</Button>
        </div>
    </div>
)
}