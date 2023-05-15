<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/user', 'App\Http\Controllers\usuario_controller@index');

Route::post('/user', 'App\Http\Controllers\usuario_controller@create');
Route::get('/user/{id}', 'App\Http\Controllers\usuario_controller@show');
Route::put('/user/{id}', 'App\Http\Controllers\usuario_controller@update');
Route::get('/user/destroy/{id}', 'App\Http\Controllers\usuario_controller@destroy');
