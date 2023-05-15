@extends('templates.template')
@section('content')

<h1 align='center' >Visualizar Usuário</h1>

<center>
    <form action="{{url("/user/{$usuario[0]->id}")}}" method="POST" align="left" style="width: 250px;">
        @csrf
        @method("PUT")

        <label>ID: </label>
        {{$usuario[0]->id}}
        <br>
        <br>
        <label>Nome: </label>
        <input type="text" name="nome" value="{{$usuario[0]->name}}">
        <br>
        <br>
        <label>Email: </label>
        <input type="text" name="email" value="{{$usuario[0]->email}}">
        <br>
        <br>
        <label>Senha: </label>
        <input type="text" name="senha" value="{{$usuario[0]->password}}">
        <br>
        <br>
        <center>
            <button type="submit">ALTERAR</button></td>
        </center>

    </form>
</center>






@endsection