@extends('templates.template')
@section('content')

<h1 align="center"> Manter Usuário</h1>

<table border="1" align="center">
    <thead>
        <tr>
            <th>ID</th>

            <th>VISUALIZAR</th>
            <th>EXCLUIR</th>


        </tr>
    </thead>

    <tbody>
        @foreach ($usuarios as $usuario)
            <tr>
                <td>{{$usuario->id}}</td>

                <td><a href="{{url("user/$usuario->id")}}"><button>VISUALIZAR</button></a></td>
                <td><a href="{{url("user/destroy/$usuario->id")}}"><button>EXCLUIR</button></a></td>

            </tr>
        @endforeach
    </tbody>
</table>
    


<center>
    <div style="border: solid 1px black; width: 500px; margin: 100px; padding-bottom: 25px;" align="center">
        <h1 align="center">CRIAR</h1>

        <form action="{{url("/user")}}" method="POST">
            @csrf
            
            <label>Nome: </label>
            <input type="text" name="nome">
            <br>
            <label>Email: </label>
            <input type="text" name="email">
            <br>
            <label>Senha: </label>
            <input type="text" name="senha">
            <br>
            <br>
            <td><button type="submit">CRIAR</button></td>

        </form>
    </div>
</center>


@endsection