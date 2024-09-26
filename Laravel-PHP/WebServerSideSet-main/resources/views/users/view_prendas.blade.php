@extends('layouts.main')
@section('content')

<form method="POST" action="{{route('prendas.create')}}">
    @csrf
    <input type="hidden" name="id" value="{{$prendas->id}}" id="">
    <div class="mb-3">
        <label for="exampleInputname1" class="form-label">Nome</label>
        <input type="text" value="{{$prendas->nome}}" name="nome" class="form-control" id="exampleInputname1" aria-describedby="namehelp" required>
        @error('name')
        nome invalido
        @enderror
    </div>

        <div class="mb-3">
            <label for="exampleInputaddress1" class="form-label">Valor Previsto</label>
            <input type="text" value="{{$prendas->valorprevisto}}" name="valorprevisto" class="form-control" id="exampleInputaddress1" aria-describedby="emailhelp" required>
            @error('address')
                 invalido
                @enderror
                <div class="mb-3">
                    <label for="exampleInputphone1" class="form-label">Valor gasto</label>
                    <input type="text" value="{{$prendas->valorgasto}}" name="valorgasto" class="form-control" id="exampleInputphone1" aria-describedby="emailhelp" required>
                    @error('phone')
                         invalido
                        @enderror
</div>
<button type="submit">Submeter</button>
</form>
<li><a href="{{ route('home') }}">Voltar</a></li>
@endsection


