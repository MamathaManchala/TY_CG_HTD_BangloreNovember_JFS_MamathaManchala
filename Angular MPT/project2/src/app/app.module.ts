import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, ChildActivationEnd } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AddPostComponent } from './add-post/add-post.component';
import { EditPostComponent } from './edit-post/edit-post.component';
import { PostsComponent } from './posts/posts.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddPostComponent,
    EditPostComponent,
    PostsComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      { path: ' ', component: HomeComponent },
      { path: 'add', component: AddPostComponent },
      { path: 'edit', component: EditPostComponent },
      { path: 'posts', component: PostsComponent  },

]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
