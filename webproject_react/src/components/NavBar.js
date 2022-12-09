import { Dropdown, Nav, Navbar, NavDropdown } from 'react-bootstrap';
import React from 'react'


export default function NavBar() {
  return (
    <nav class="navbar navbar-expand navbar-dark bg-dark" aria-label="Second navbar example">
      <div class="container-fluid">
        <a class="navbar-brand" href="create">Create new view</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarsExample02">
          <ul class="navbar-nav me-auto">
            <li class="nav-link active">
              <a class="nav-link active" aria-current="page" href="default1">Tempature data and co2 concentrations ja emission sources</a>
            </li>
            <li class="nav-link active">
              <a class="nav-link active" aria-current="page" href="v1">V1/V2</a>
            </li>
            <li class="nav-link active">
              <a class="nav-link active" aria-current="page" href="v3">V3</a>
            </li>
          </ul>
          <Dropdown>
            <Dropdown.Toggle id="dropdownmenu" variant='secondary'>
            </Dropdown.Toggle>
            <Navbar.Collapse>
              <Dropdown.Menu variant="dark">
                <NavDropdown.Item href="/settings">Settings</NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="/">Log out</NavDropdown.Item>
              </Dropdown.Menu>
            </Navbar.Collapse>
          </Dropdown>
          
        </div>
      </div>
    </nav>
  )
}

/*
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
        <NavDropdown.Item href="/views">My views</NavDropdown.Item>
        <NavDropdown.Item href="/settings">Settings</NavDropdown.Item>
        <NavDropdown.Divider/>
        <NavDropdown.Item href="/">Log out</NavDropdown.Item>
      </Nav>
        </Navbar.Collapse>
    </Navbar>
    
  )
  
}

*/