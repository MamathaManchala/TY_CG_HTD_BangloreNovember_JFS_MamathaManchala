import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { PostsService } from '../posts.service';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {

  message: string;

  constructor(private postsService: PostsService) { }
  
  ngOnInit() {
  }

  addPost(form: NgForm) {
    this.postsService.postsData(form.value).subscribe(data => {
        console.log(data);
        this.message = data.message;
        setTimeout(() => {
          this.message = null;
        }, 2000);
        form.reset();
      }, err => {
        console.log(err);
      });

    }
  }
