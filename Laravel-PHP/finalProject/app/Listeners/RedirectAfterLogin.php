<?php

namespace App\Listeners;

use Illuminate\Contracts\Queue\ShouldQueue;
use Illuminate\Queue\InteractsWithQueue;
use Illuminate\Auth\Events\Authenticated;
use Illuminate\Support\Facades\Redirect;

class RedirectAfterLogin
{
    public function handle(Authenticated $event)
    {

        return Redirect::route('admin.dashboard');
    }
    public function __construct()
    {
        //
    }
}
