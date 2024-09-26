@extends('layouts.main')
@section('content')
<h1>PRENDAS</h1>
@if (session('message'))
        <div class="alert alert-sucess">{{session('message')}}</div>
        @endif
<form action="">
    <input type="text" placeholder="Search" name="search">
    <button type="submit" class="btn btn-info" >Procurar</button>
</form>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Prendas ID</th>
        <th scope="col">ID User</th>
        <th scope="col">Nome</th>
        <th scope="col">Preço Previsto</th>
        <th scope="col">Preço Gasto</th>
        <th>
      </tr>
    </thead>
    <tbody>
        @foreach ($prendas as $item)
        <tr>
          <td scope="row">{{$item->id}}</td>
          <td>{{$item->users_name}}</td>
          <th>{{$item->nome}}</th>
          <td>{{$item->valorprevisto}}</td>
          <td>{{$item->valorgasto}}</td>
          <td><a href="{{route('users.view_prendas',$item->id)}}" class="btn btn-info">Ver/Editar</a></button></td>
          <td><a href="{{route('prendas.delete',$item->id)}}" class="btn btn-danger">Delete</a></button></td>
        </tr>
          @endforeach
    </th>
    </tbody>
  </table>
  <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
