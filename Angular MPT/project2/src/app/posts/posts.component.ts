import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';
import {HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  message;
  posts: Posts[];

 

  constructor(private postsService: PostsService, private router: Router) {
    this.getPosts();

   }

   getPosts() {
     this.postsService.getData().subscribe(response => {
       console.log(response);
       this.posts = response.post;
     }, err => {
       console.log(err);
     });
   }


  ngOnInit() {
  }

}
