<?php

namespace App\Http\Controllers;

use App\Models\Banda;

class AlbumController extends Controller
{
    public function index(Banda $banda) {
        $albuns = $banda->albuns;
        return view('music.albums', compact('banda', 'albuns'));
    }
}
