<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Banda extends Model
{
    protected $fillable = ['nome', 'foto', 'numero_albuns'];

    public function albuns() {
        return $this->hasMany(Album::class);
    }
}

