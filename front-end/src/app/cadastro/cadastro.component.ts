import { Component, OnInit } from '@angular/core';
import { Usuario } from '../model/usuario.model';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormsModule, ReactiveFormsModule, } from '@angular/forms';
import { AppService } from '../app.service';

@Component({
  selector: 'cadastro.components',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent  implements OnInit{

  date1: Date;

  date2: Date;

  date3: Date;

  date4: Date;

  date5: Date;

  date6: Date;

  date7: Date;

  date8: Date;

  date9: Date;

  date10: Date;

  date11: Date;

  date12: Date;

  date13: Date;

  date14: Date;

  dates: Date[];

  rangeDates: Date[];

  minDate: Date;

  maxDate: Date;

  invalidDates: Array<Date>


  public appForm: FormGroup;
  public usuarios: Usuario[] = [];
  public exibir: boolean = false;
  constructor(
    private fb: FormBuilder,
    private service: AppService,

  ){}

  save(): void {
    console.log(this.appForm.value)
    this.service.saveUser(this.appForm.value).subscribe(result => {});
    this.appForm.reset();
  }

  list(): void {
    this.exibir = true;
    this.service.listUser().subscribe(usuario => this.usuarios = usuario);
    this.appForm.reset();
  }

  edit(): void{
   

  }

  ngOnInit(): void{
    this.appForm = this.fb.group({
    firstname:['', [Validators.required]],
    lastname: ['', [Validators.required]],
    office: ['', [Validators.required]],
    dateofbirth: ['', [Validators.required]],
    address: ['', [Validators.required]],
    number: ['', [Validators.required]],
    district: ['', [Validators.required]],
    city: ['', [Validators.required]],
    state: ['', [Validators.required]],
    zip: ['', [Validators.required]]
    });

    let today = new Date();
    let month = today.getMonth();
    let year = today.getFullYear();
    let prevMonth = (month === 0) ? 11 : month -1;
    let prevYear = (prevMonth === 11) ? year - 1 : year;
    let nextMonth = (month === 11) ? 0 : month + 1;
    let nextYear = (nextMonth === 0) ? year + 1 : year;
    this.minDate = new Date();
    this.minDate.setMonth(prevMonth);
    this.minDate.setFullYear(prevYear);
    this.maxDate = new Date();
    this.maxDate.setMonth(nextMonth);
    this.maxDate.setFullYear(nextYear);

    let invalidDate = new Date();
    invalidDate.setDate(today.getDate() - 1);
    this.invalidDates = [today,invalidDate];



  }
  title = '';
  selectedState: any = null;
  states: any[] = [
    {name: 'AC', code: 'AC'},
    {name: 'AL', code: 'AL'},
    {name: 'AP', code: 'AP'},
    {name: 'BA', code: 'BA'},
    {name: 'CE', code: 'CE'},
    {name: 'DF', code: 'DF'},
    {name: 'ES', code: 'ES'},
    {name: 'GO', code: 'GO'},
    {name: 'MA', code: 'MA'},
    {name: 'MT', code: 'MT'},
    {name: 'MS', code: 'MS'},
    {name: 'MG', code: 'MG'},
    {name: 'PA', code: 'PA'},
    {name: 'PB', code: 'PB'},
    {name: 'PR', code: 'PR'},
    {name: 'PE', code: 'PE'},
    {name: 'PI', code: 'PI'},
    {name: 'RJ', code: 'RJ'},
    {name: 'RN', code: 'RN'},
    {name: 'RS', code: 'RS'},
    {name: 'RO', code: 'RO'},
    {name: 'RR', code: 'RR'},
    {name: 'SC', code: 'SC'},
    {name: 'SP', code: 'SP'},
    {name: 'SE', code: 'SE'},
    {name: 'TO', code: 'TO'},



];


cities1: any[] = [];

    cities2: any[] = [];

    city1:any = null;

    city2:any = null;


  upper(){
    this.title = this.title.toLowerCase();
  };


}
