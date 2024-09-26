@extends('layouts.main')
@section('content')

<!--já estou a carregar o obj user-->

<form method="POST" action="{{route('users.create')}}">
    @csrf
    <input type="hidden" name="id" value="{{$users->id}}" id="">

    <div class="mb-3">
        <label for="exampleInputname1" class="form-label">Name</label>
        <input type="text" value="{{$users->name}}" name="name" class="form-control" id="exampleInputname1" aria-describedby="namehelp" required>
        @error('name')
        name invalido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputemail1" class="form-label">Email</label>
    <input disabled type="email" value="{{$users->email}}" name="email" class="form-control" id="exampleInputemail1" aria-describedby="emailhelp">
    @error('email')
        email invalido
        @enderror
        <div class="mb-3">
            <label for="exampleInputaddress1" class="form-label">Address</label>
            <input type="text" value="{{$users->address}}" name="address" class="form-control" id="exampleInputaddress1" aria-describedby="emailhelp" required>
            @error('address')
                address invalido
                @enderror
                <div class="mb-3">
                    <label for="exampleInputphone1" class="form-label">Phone</label>
                    <input type="text" value="{{$users->phone}}" name="phone" class="form-control" id="exampleInputphone1" aria-describedby="emailhelp" required>
                    @error('phone')
                        phone invalido
                        @enderror
</div>
<button type="submit">Submeter</button>
</form>
<li><a href="{{ route('home') }}">Voltar</a></li>
@endsection

