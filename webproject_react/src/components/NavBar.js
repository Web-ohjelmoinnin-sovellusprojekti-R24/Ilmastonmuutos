import React from 'react'
import { Nav, Navbar, NavDropdown } from 'react-bootstrap';



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
                            <a class="nav-link active" aria-current="page" href="default1">Tempature data and co2 concentrations and emission sources</a>
                        </li>
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="default2">Emission sources</a>
                        </li>
                    </ul>

                    <ul class="navbar-nav ml-auto">
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="login">Login</a>
                        </li>
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="myviews">MyViews</a>
                        </li>
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="settings">Settings</a>
                        </li>
                    </ul>   
                </div>
            </div>
        </nav>
    )
}


/*
export default function NavBar() {
    return (
        <Navbar expand="lg">
            <Navbar.Brand>
                <p id="nav-dropdown">Create new view</p>
            </Navbar.Brand>
            <Navbar.Toggle />
            <Navbar.Collapse className='nav-link'>
                <Nav>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/default1">Temperature data, co2 concentrations and emission sources&nbsp;&nbsp;</NavDropdown.Item>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/default2">Emission sources&nbsp;&nbsp;</NavDropdown.Item>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/login">Login</NavDropdown.Item>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/myviews">My views&nbsp;&nbsp;</NavDropdown.Item>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/settings">Settings&nbsp;&nbsp;</NavDropdown.Item>
                    <NavDropdown.Item className='nav-link' id="nav-dropdown" href="/">Log out</NavDropdown.Item>
                </Nav>
            </Navbar.Collapse>
        </Navbar>

    )

}
*/

