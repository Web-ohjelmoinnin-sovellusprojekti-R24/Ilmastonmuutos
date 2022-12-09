import React, { useState } from "react";
import { Link } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Form, Col, Row, Container } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';
import axios from "axios";


export default function Login() {
    const URL = "http://localhost:8080/login";
    const [user, setUser] = useState("");
    const [pass, setPass] = useState("");
    const [errorMessage, seterrorMessage] = useState("")
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
                navigate('/create');
            })
        .catch(function (error) {
                if (error.response.status === 401) {
                    seterrorMessage("Wrong username or password");
               }
                console.log(error);
            })
        event.preventDefault();

    }
    return (
        <div>

            <Form onSubmit={handleSubmit}>
                <Form.Group>
                    <Form.Label>Username</Form.Label>
                    <Form.Control type="username" placeholder="Example1234" autoFocus value={user} onChange={(e) => setUser(e.target.value)} />
                </Form.Group>
                <Form.Group>
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="********" value={pass} onChange={(e) => setPass(e.target.value)} />
                </Form.Group>
            </Form>
            <div class="text-center">
                <Button className="loginbtn" type="submit" disabled={!Validate()} onClick={handleSubmit}>Login</Button>
            </div>

            <div>
                <p className="loginpagetext">Don't have an account? <Link to="/CreateUser">Create one!</Link></p>
            </div>

            <div class="text-danger">
                <p className="loginpagetext" >{errorMessage}</p>
            </div>

        </div>
    )
}