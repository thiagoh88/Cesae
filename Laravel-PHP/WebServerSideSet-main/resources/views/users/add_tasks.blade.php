@extends('layouts.main')
@section('content')
    <h1>Olá, aqui vais poder adicionar Tasks!</h1>
    <form method="POST" action="{{route('tasks.create')}}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputname1" class="form-label">Name</label>
            <input type="text" name="name" class="form-control" id="exampleInputname1" aria-describedby="" required>
        </div>
        <div class="mb-3">
        <label for="exampleInputdescription" class="form-label">Descrição</label>
        <input type="text" name="description" class="form-control" id="exampleInputdescription1" aria-describedby="" required>
        @error('description')
        obrigatorio!
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputuser_id" class="form-label">User ID</label>
        <div> <select required name="user_id" id="">
            @foreach ($users as $item )
                <option value="{{$item->id}}">{{$item->name}}</option>
            @endforeach
        </select> </div>
    </div>
    <div> <button type="submit">Submeter</button></div>
    </form>
    <div>  <li><a href="{{ route('home') }}">Voltar</a></li></div>

@endsection
