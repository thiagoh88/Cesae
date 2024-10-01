<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use PhpParser\Node\Expr\FuncCall;

class IndexController extends Controller
{
    public function callHome(){
        $welcome = 'Hello Turma SD';
        $name = 'Sara';
        $cesaeInfo = $this->getCourseInfo();
        $contactInfo = $this->getContactInfo();
        $infoCesae = $this->getCesaeInfo();

        //dd($contactInfo);

        return view('general.home',compact('welcome','name', 'cesaeInfo', 'contactInfo', 'infoCesae'));
    }

    protected function getCourseInfo(){
        $info = ['Laravel', 'Angular', 'Sql'];
        return $info;
    }

    protected function getContactInfo(){
         return $contactInfo = [
            ['id'=>1, 'name' => 'Sara','phone' => 914444444],
            ['id'=>2, 'name' => 'Márcia','phone' => 914444444],
            ['id'=>3, 'name' => 'Bruno','phone' => 914444444]
        ];
    }

    private function getCesaeInfo(){
         return $cesaeInfo = [
            'name' =>'cesae',
            'address'=> 'Rua do Cesae, nr cesae',
            'email'=> 'cesae@cesae.pt'
        ];
    }
}
