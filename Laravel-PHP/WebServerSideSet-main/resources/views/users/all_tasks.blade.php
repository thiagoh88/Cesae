@extends('layouts.main')
@section('content')
    <h1>TASKS</h1>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Nome</th>
            <th scope="col">Descrição</th>
            <th scope="col">Responsável</th>

          </tr>
        </thead>
        <tbody>
            @foreach ($tasks as $item)
            <tr>
                <td>{{$item->id}}</td>
              <th scope="row">{{$item->name}}</th>
              <td>{{$item->description}}</td>
              <td>{{$item->users_name}}</td>
              <td><a href="{{route('users.view_task',$item->id)}}" class="btn btn-info">Ver/Editar</a></button></td>
        <td><a href="{{route('users.delete',$item->id)}}" class="btn btn-danger">Delete</a></button></td>
      </tr>
              @endforeach
        </tbody>
      </table>
    <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
