<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Bandas extends Model
{
    protected $fillable = ['nome', 'foto', 'numero_albuns'];

    public function albums() {
        return $this->hasMany(Album::class);
    }
}
