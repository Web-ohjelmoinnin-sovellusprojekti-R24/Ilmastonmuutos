import React from 'react'
import {Nav, Navbar, NavDropdown} from 'react-bootstrap';

export default function NavBar() {
  return (
    <Navbar bg="light-blue" variant="blue"
       expand="lg">
        <Navbar.Brand>
         <p>Create new view</p> 
        </Navbar.Brand>
        <Navbar.Toggle/>
        <Navbar.Collapse>
        <Nav>
      <NavDropdown alignRight title="dropdown">
        <NavDropdown.Item href="/views">My views</NavDropdown.Item>
        <NavDropdown.Item href="/settings">Settings</NavDropdown.Item>
        <NavDropdown.Divider/>
        <NavDropdown.Item href="/">Log out</NavDropdown.Item>
      </NavDropdown>
      </Nav>
        </Navbar.Collapse>
    </Navbar>
    
  )
}
