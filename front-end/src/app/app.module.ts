
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ButtonModule} from 'primeng/button';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {InputTextModule} from 'primeng/inputtext';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CheckboxModule} from 'primeng/checkbox';
import { RadioButtonModule} from 'primeng/radiobutton';
import { DropdownModule} from 'primeng/dropdown';
import { InputTextareaModule} from 'primeng/inputtextarea';
import { PanelMenuModule} from 'primeng/panelmenu';
import { MatToolbarModule} from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatTabsModule } from '@angular/material/tabs';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { CadastroComponent } from './cadastro/cadastro.component';
import { routing } from './app.routing';
import {CalendarModule} from 'primeng/calendar';


@NgModule({
  declarations: [
    AppComponent,
    CadastroComponent,



  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    ButtonModule,
    InputTextModule,
    FormsModule,
    CheckboxModule,
    RadioButtonModule,
    DropdownModule,
    InputTextareaModule,
    PanelMenuModule,
    HttpClientModule,
    ReactiveFormsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatTabsModule,
    MatCardModule,
    MatInputModule,
    MatFormFieldModule,
    routing,
    CalendarModule,



  ],
  providers: [],
  bootstrap: [AppComponent, CadastroComponent,]
})
export class AppModule { }
