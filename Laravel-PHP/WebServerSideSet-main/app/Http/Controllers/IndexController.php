<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    public function indexHome(){

        $welcome = 'Site Novo';
        $name ='Thiago';
        $cesaeInfo = $this->getCourseInfo();
        $contactInfo = $this->getCourseInfo();
        $infoCesae = $this->getCesaeInfo();

        //dd($contactInfo);

        return view('general.home',compact('welcome', 'name', 'cesaeInfo','contactInfo','infoCesae'));
    }

    protected function getCourseInfo (){
      return $contactInfo = [
            ['id' => 1,'name' => 'Sara', 'phone' => '99999'],
            ['id' => 2,'name' => 'Bruno', 'phone' => '88888'],
            ['id' => 3,'name' => 'Marcia', 'phone' => '77777']
        ];

    }

    protected function getCesaeInfo (){
        return $infoCesae = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-12 Porto',
            'email' => 'cesae@cesae.pt'
        ];
    }

}
