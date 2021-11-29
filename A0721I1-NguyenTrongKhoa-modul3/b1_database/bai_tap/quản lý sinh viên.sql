-- tạo database
create database quan_li_sinh_vien;
-- xóa database
drop database world;
-- sử dụng database
use quan_li_sinh_vien;
-- xóa bảng
drop table Class;

-- tạo bảng
create table Class(
id int,
name varchar(70),
primary key(id)
);

create table Teacher(
id int,
name varchar(70),
age tinyint(100),
country varchar(150)
);
-- hiển thị bảng
select * from Teacher;

-- thêm thông tin
insert into Teacher values(1, "Khoa", 20, "QN");

-- thêm thiếu thông tin
insert into Teacher(name,age) values("duc",20);
insert into Teacher(name,age) values("duc",20),("chau",21);

-- thay đổi cấu trúc của bảng
-- first nếu muốn thêm cột ở trước 
-- after để thêm vào sau 1 cột nào đó
alter table teacher add mo_ta text after age;

-- cập nhật thông tin 
set SQL_SAFE_UPDATES = 0;
update teacher set age = "35"
where name = "khoa";

-- xóa tên và cập nhật
delete from teacher where name = "khoa";
set SQL_SAFE_UPDATES = 1;