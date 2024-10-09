<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class Albums extends Model
{
    protected $fillable = ['nome', 'imagem', 'data_lancamento', 'banda_id'];

    public function banda() {
        return $this->belongsTo(Bandas::class);
    }
    public function up()
    {
        Schema::create('albums', function (Blueprint $table) {
            $table->id();
            $table->string('nome');
            $table->string('imagem')->nullable();
            $table->foreignId('banda_id')->constrained()->onDelete('cascade');
            $table->timestamps();
        });
    }

    public function down()
    {
        Schema::dropIfExists('albums');
    }
}
