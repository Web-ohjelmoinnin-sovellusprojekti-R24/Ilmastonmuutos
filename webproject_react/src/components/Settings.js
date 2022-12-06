import React from "react";
import {Button, Form, Col, Row, Container} from 'react-bootstrap';


export default function Settings() {
return (
    <div>
       <Form>
           <Form.Group>
            <Form.Label className="createusertext">Change user info</Form.Label>
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
            <p className="deleteusertext">DELETE USER</p>
        </div>
    </div>
)
}