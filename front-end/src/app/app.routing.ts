
import { CadastroComponent } from './cadastro/cadastro.component';
import {  Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ModuleWithProviders } from '@angular/core';
import { RouterModule } from '@angular/router';

const AP_ROUTES: Routes = [

  { path: '', component: AppComponent },
  { path: 'cadastro', component: CadastroComponent },



];


declare module "@angular/core" {
  interface ModuleWithProviders<T = any> {
      ngModule: Type<T>;
      providers?: Provider[];
  }
}

export const routing: ModuleWithProviders = RouterModule.forRoot(AP_ROUTES);


