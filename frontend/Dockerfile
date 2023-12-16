# FROM node:18-alpine as build
# WORKDIR /app
# COPY package.json package-lock.json ./
# RUN npm install
# RUN npm install -g @angular/cli
# COPY . .
# RUN npm run build
# EXPOSE 4200
# CMD ["ng", "serve", "--host=0.0.0.0"]

FROM node:18-alpine as build
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build

FROM nginx:alpine
COPY --from=build /app/dist/my-angular-app/browser /usr/share/nginx/html
# EXPOSE 80
# CMD ["nginx", "-g", "daemon off;"]

