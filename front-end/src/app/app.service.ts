
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuario } from './model/usuario.model';
import { Observable } from 'rxjs';
import { HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AppService {

  uri = 'http://localhost:8080/cadastro';

  httpOptions = {
    headers: new HttpHeaders({

      'Content-Type': 'application/json'

      })

      };

private readonly API = 'http://localhost:8080/cadastro'

  constructor(private httpClient: HttpClient) { }



  public saveUser(usuario: any): Observable<Usuario>{
    return this.httpClient.post<any>(this.uri,usuario, this.httpOptions);

  }
    public listUser(): Observable<Usuario[]>{
      return this.httpClient.get<Usuario[]>(this.uri, this.httpOptions);

}

}
