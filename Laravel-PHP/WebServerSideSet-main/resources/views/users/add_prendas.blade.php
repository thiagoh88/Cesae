@extends('layouts.main')
@section('content')
    <h1>ADICIONAR PRENDAS</h1>
    <form method="POST" action="{{route('prendas.create')}}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputnome1" class="form-label">Name</label>
            <input type="text" name="nome" class="form-control" id="exampleInputnome1" aria-describedby="namehelp" required>
            @error('nome')
            name invalido
            @enderror
        </div>
            <div class="mb-3">
                <label for="exampleInputuser_id" class="form-label">User ID</label>
                <div> <select required name="id_user" id="">
                    @foreach ($users as $item )
                        <option value="{{$item->id}}">{{$item->name}}</option>
                    @endforeach
                </select> </div>
            </div>
        <div class="mb-3">
        <label for="exampleInputvalorprevisto1" class="form-label">Valor Previsto</label>
        <input type="text" name="valorprevisto" class="form-control" id="exampleInputvalorprevisto1" aria-describedby="namehelp" required>
    </div>
    <div class="mb-3">
        <label for="exampleInputvalorgasto1" class="form-label">Valor Gasto</label>
        <input type="text" name="valorgasto" class="form-control" id="exampleInputvalorgasto" aria-describedby="" required>
        <button type="submit">Submeter</button>
    </div>
    </form>
    <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
