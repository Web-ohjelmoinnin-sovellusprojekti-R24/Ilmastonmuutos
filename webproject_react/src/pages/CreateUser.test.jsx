import React from "react";
import {render, screen} from '@testing-library/react'
import '@testing-library/jest-dom/extend-expect'
import CreateUser from './CreateUser'
import userEvent from "@testing-library/user-event";
import { BrowserRouter } from "react-router-dom";


describe ('CreateUser', () => {
    describe('Shows error when form is sent', () => {
        test('Without password', () =>{
        render( <BrowserRouter>
        <CreateUser/>
        </BrowserRouter>)
        const usernameInput = screen.getByLabelText('Create user');
        userEvent.type(usernameInput, 'teppo');
        userEvent.click(screen.getByText('Create account'));
        
        expect(
            screen.getByText('Forgot password?'),
        ).toBeInTheDocument();
    });
    });
})
