import { Directive, ElementRef, Renderer2, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {



  @HostBinding('style.background') backgroundColor: String;

  constructor(private el: ElementRef, private renderer: Renderer2) { 
    // this.el.nativeElement.style.background = 'blue';
    // this.el.nativeElement.style.fontSize = '20px';
    
    // let h1 = this.renderer.createElement('h1');
    // let text = this.renderer.createText('Hello from Custom Directive');
    // this.renderer.appendChild(h1, text);
    // this.renderer.appendChild(this.el.nativeElement, h1);


  }




  @HostListener('mouseenter')
  x() {
//this.el.nativeElement.style.background = '#eee';
this.backgroundColor = 'lightgreen';
this.el.nativeElement.style.color = 'yellow';
this.el.nativeElement.style.fontSize = '20px';

  }

  @HostListener('mouseleave')
  y() {
this.el.nativeElement.style.background = '#eee';
this.el.nativeElement.style.color = 'green';
this.el.nativeElement.style.fontSize = '10px';

  }

}
