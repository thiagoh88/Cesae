<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Album extends Model
{
    protected $fillable = ['nome', 'imagem', 'data_lancamento', 'banda_id'];

    public function banda() {
        return $this->belongsTo(Banda::class);
    }
}
