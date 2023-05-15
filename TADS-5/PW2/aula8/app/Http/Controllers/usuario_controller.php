<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;

class usuario_controller extends Controller
{
    private $objeto_usuario;

    public function __construct(){
        $this->objeto_usuario = new User();
    }


    public function index(){
        $usuarios = $this->objeto_usuario->all();
        return view('index', compact('usuarios'));
    }


    public function create(){
        $nome = request("nome");
        $email = request("email");
        $senha = request("senha");

        $this->objeto_usuario->insert(["name" => $nome, "email" => $email, "password" => $senha]);
        return redirect("/user");
    }


    public function show(string $id){
        $usuario = $this->objeto_usuario->select('*')->where("id", "=", $id)->get();
        return view('view', compact('usuario'));
    }


    public function update($id){        
        $nome = request("nome");
        $email = request("email");
        $senha = request("senha");
        
        $this->objeto_usuario->where("id", "=", $id)->update(['name' => $nome, 'email' => $email, 'password' => $senha]);
        return redirect("/user");

    }


    public function destroy(string $id){
        $this->objeto_usuario->where("id", "=", $id)->delete();
        return redirect("/user");
    }
}
