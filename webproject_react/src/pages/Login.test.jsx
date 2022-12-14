import React from "react";
import {render, screen} from '@testing-library/react'
import '@testing-library/jest-dom/extend-expect'
import Login from './Login'
import userEvent from "@testing-library/user-event";
import { BrowserRouter } from "react-router-dom";


describe ('Login', () => {
    describe('Shows error when form is sent', () => {
        test('Without password', () =>{
        render( <BrowserRouter>
        <Login/>
        </BrowserRouter>)
        const usernameInput = screen.getByLabelText('username');
        userEvent.type(usernameInput, 'teppo');
        userEvent.click(screen.getByText('Login'));
        
        expect(
            screen.getByText('Forgot password?'),
        ).toBeInTheDocument();
    });
    });
})

