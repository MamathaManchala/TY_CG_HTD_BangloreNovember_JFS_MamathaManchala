import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  url = 'http://localhost:8081';

  constructor(private http: HttpClient) { }

  registerUser(userDetails): Observable<any> {
    return this.http.post<any>(`${this.url}/add-user`, userDetails);
  }

  loginUser(userCredentials): Observable<any>{
    return this.http.post<any>(`${this.url}/user-login`, userCredentials);
  }
}
