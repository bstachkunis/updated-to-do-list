import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment'; // Import environment

export interface Task {
    id: number;
    title: string;
    description: string;
}

@Injectable({
    providedIn: 'root'
})
export class TaskService {
    private apiUrl = environment.apiUrl;

    constructor(private http: HttpClient) {}

    getTasks(): Observable<Task[]> {
        return this.http.get<Task[]>(`${this.apiUrl}`);
    }

    createTask(task: Task): Observable<Task> {
        return this.http.post<Task>(`${this.apiUrl}`, task);
    }
}



