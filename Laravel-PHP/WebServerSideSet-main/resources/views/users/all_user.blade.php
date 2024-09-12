@extends('layouts.main')
@section('content')
<h1>Olá, aqui vais ver uma lista de users!</h1>
<li><a href="{{ route('home') }}">Voltar</a></li>
{{-- <h5>{{$myUsers->name}}</h5> --}}
<table class="table">
    <thead>
      <tr>
        <th scope="col">#</th>
        <th scope="col">Nome</th>
        <th scope="col">E-mail</th>
        <th scope="col">Password</th>
        <th>
      </tr>
    </thead>
    <tbody>
        @foreach ($users as $item)
      <tr>
        <th scope="row">{{$item->id}}</th>
        <td>{{$item->name}}</td>
        <td>{{$item->email}}</td>
        <td>{{$item->password}}</td>
        <td><a href="{{route('users.view_user',$item->id)}}" class="btn btn-info">Ver/Editar</a></button></td>
        <td><a href="{{route('users.delete',$item->id)}}" class="btn btn-danger">Delete</a></button></td>
      </tr>
        @endforeach
    </th>


    </tbody>
  </table>
@endsection
