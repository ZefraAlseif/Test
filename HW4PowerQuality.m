%% H.W # 4 EEL 6219 Power Quality
%% Problem 1: f(x) periodic function period of 2pi such that:
    % f(x) = { 1, -pi < x < 0 ; 0, 0 < x < pi }
% a) Sketch graph of f(x) in the interval of -2pi < x < 2pi
    t = linspace(-2*pi,2*pi,100);
    x = (-square(t)+1)/2;
    plot(t,x); 
% b) Show that Fourier series in the interval pi < x < pi is: 
% [1/2 -2/pi[sinx + 1/3 * sin3x + 1/5* sin5x + ...]
% Performing Integral for a0, an, bn:
    func1 = @ (t) (-square(t)+1)/2;
    a0 = integral(func1,-pi,pi)*1/(2*pi);
    bn = 0;
    syms N;
    syms T;
    an = int(sin(pi*N*T),-pi,0)*2/(2*pi);

    FS = a0 + symsum(an*sin(pi*N*T),N,1,7)
% c) find the value that gives the sum pi/4 = 1-1/3+1/5-1/7 
% This is an alternating sum of 1/n where n is odd numbers, Hence:
% symsum((-1)^N*(1/(2*N+1)),N,0,inf) which is giving by setting T =pi/2
    symsum((-1)^N*(1/(2*N+1)),N,0,inf)

%% Problem 2: f(x) periodic function period of 2pi such that:
    % f(x) = { x/2;  0 < x < 2pi }
% a) Sketch graph of f(x) in the interval of 0 < x < 4pi
    t = linspace(0,4*pi,1000);
    x = ((sawtooth(t)+1)/2)*pi;
    plot(t,x)
% b) Show that Fourier series in the interval 0 < x < 2pi is: 
% pi/2-[sin(x)+sin(2x)/2+sin(3x)/3+....]
% Performing Integral for a0, an, bn:
    func1 = @ (t) ((sawtooth(t)+1)/2)*pi;
    a0 = integral(func1,0,2*pi)*1/(2*pi);
    bn = 0;
    syms N;
    syms T;
    an = int(T/2*sin(pi*N*T),0,2*pi)*2/(2*pi);
    FS = a0 + symsum(an*sin(pi*N*T),N,1,7)
% c) find the value that gives the sum pi/4 = 1-1/3+1/5-1/7 
% This is an alternating sum of 1/n where n is odd numbers, Hence:
% symsum((-1)^N*(1/(2*N+1)),N,0,inf) which is giving by setting T =pi/2
    symsum((-1)^N*(1/(2*N+1)),N,0,inf)
   
%% Problem 3: f(x) periodic function period of 2pi such that:
    % f(x) = { 1-t^2;  -1 < t < 1 }
    syms N;
    syms T;
    a0 = int(1-T^2,-1,1)*1/(2);
    an = 0;
    bn = int((1-T^2)*cos(pi*N*T),-1,1);
    FS = a0 + symsum(bn*cos(pi*N*T),N,1,7)
% c) find the value that gives the sum pi/4 = 1-1/3+1/5-1/7 
% This is an alternating sum of 1/n where n is odd numbers, Hence:
% symsum((-1)^N*(1/N),N,1,inf) which is giving by setting T =pi/2
    symsum((-1)^N*(1/N),N,1,inf)
   
    