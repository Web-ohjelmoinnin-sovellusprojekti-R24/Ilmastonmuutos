import React from 'react'

export default function NavBar() {
    return (
        <nav class="navbar navbar-expand navbar-dark bg-dark" aria-label="Second navbar example">
            <div class="container-fluid">
                <a class="navbar-brand" href="create">Create</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarsExample02">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="v1">V1/V2</a>
                        </li>
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="v3">V3</a>
                        </li>

                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-link active">
                            <a class="nav-link active" aria-current="page" href="/login">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    )
}
