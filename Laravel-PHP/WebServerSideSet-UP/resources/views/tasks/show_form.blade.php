@extends('layouts.main')
@section('content')
    <h1>Olá, aqui vais poder adicionar tarefas!</h1>
    <form method="POST" action="{{ route('tasks.store') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome da Tarefa</label>
            <input type="text" name="name" class="form-control" required>
            @error('name')
                name da tarefa inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Descrição da Tarefa</label>
            <input type="text" name="description" class="form-control" required>
            @error('description')
            descrição da tarefa obrigatório
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Utilizador</label>
            <select required name="user_id" id="">
                @foreach ($users as $user )
                    <option value="{{$user->id}}">{{$user->name}}</option>
                @endforeach
            </select>
            @error('user_id')
            user_id inválido
            @enderror
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
@endsection
