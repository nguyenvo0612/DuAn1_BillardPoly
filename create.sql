create database QuanBida
use QuanBida

create table BanChoi (
	id int identity(1,1) primary key,
	maBan varchar(10),
	tenBan nvarchar(20),
	gia decimal(20, 3),
	moTa nvarchar(100),
	TGBD varchar(50),
	TGKT varchar(50),
	idCSVC int,
	tienBan decimal(20, 3),
	tinhTrang int,

)


create table CoSoVatChat (
	id int identity(1,1) primary key,
	ma varchar(10),
	ten nvarchar(50),
	tinhTrang int
)



create table ChiTietBanChoi (
	id int identity(1,1) primary key,
	idDV int,
	idBan int,
	ma varchar(10),
	ten nvarchar(50),
	soLuong int,
	gia decimal(20, 3),
	tinhTrang int
)

create table DichVu (
	id int identity(1,1) primary key,
	ma varchar(10),
	ten nvarchar(50),
	gia decimal(20, 3),
	loaiDV nvarchar(50),
	soLuong int,
	tinhTrang int
)

create table HoaDonChiTiet (
	id int identity(1,1) primary key,
	idHD int,
	idBan int,
	tinhTrang int
)

create table HoaDon (
	id int identity(1,1) primary key,
	idKH int,
	idNV int,
	maHD varchar(20),
	maNV varchar(20),
	ngayTao date,
	ngayThanhToan date,
	maKM varchar(10),
	tienKhachDua decimal(20,3),
	tongTien decimal(20, 3),
	tienSauKM decimal(20,3),
	idKM int,
	DiemSD int,
	tinhTrang int
)

create table KhuyenMai (
	id int identity(1,1) primary key,
	ma varchar(10),
	ten nvarchar(50),
	phanTramGiam int,
	ngayApDung date,
	ngayKetThuc date,
	tinhTrang int
)

create table KhachHang (
	id int identity(1,1) primary key,
	ma varchar(10),
	ten nvarchar(50),
	gioiTinh int,
	ngaySinh date,
	diaChi nvarchar(100),
	sdt varchar(10),
	diemTichLuy int,
	soCMT varchar(12),
	tinhTrang int
)
alter table KhachHang add email varchar(50)

create table NhanVien (
	id int identity(1,1) primary key,
	ma varchar(10),
	ten nvarchar(50),
	gioiTinh int,
	ngaySinh date,
	diaChi nvarchar(100),
	sdt varchar(10),
	soCMT varchar(12),
	matKhau varchar(20),
	vaiTro int,
	tinhTrang int
)
alter table NhanVien add EMAIL VARCHAR(50);
alter table NhanVien add img VARCHAR(200);



ALTER TABLE HoaDon ADD FOREIGN KEY (idKM) REFERENCES KhuyenMai(id)
ALTER TABLE HoaDon ADD FOREIGN KEY (idNV) REFERENCES NhanVien(id)
ALTER TABLE HoaDon ADD FOREIGN KEY (idKH) REFERENCES KhachHang(id)
ALTER TABLE HoaDonChiTiet ADD FOREIGN KEY (idHD) REFERENCES HoaDon(id)
ALTER TABLE HoaDonChiTiet ADD FOREIGN KEY (idBan) REFERENCES BanChoi(id)
ALTER TABLE ChiTietBanChoi ADD FOREIGN KEY (idDV) REFERENCES DichVu(id)
ALTER TABLE ChiTietBanChoi ADD FOREIGN KEY (idBan) REFERENCES BanChoi(id)
ALTER TABLE BanChoi ADD FOREIGN KEY (idCSVC) REFERENCES CoSoVatChat(id)

select * from KhuyenMai
delete KhuyenMai
INSERT INTO KhuyenMai(MA, TEN, phanTramGiam, ngayApDung, ngayKetThuc, tinhTrang) VALUES('GIOTO10',N'Giỗ Tổ Hùng Vương',20,'2023/04/01','2023/04/30',1);

select * from CoSoVatChat
delete CoSoVatChat
insert into CoSoVatChat(ma,ten,tinhTrang) values('BAN01',N'Bàn 1',1);
insert into CoSoVatChat(ma,ten,tinhTrang) values('BAN02',N'Bàn 2',1);
insert into CoSoVatChat(ma,ten,tinhTrang) values('BAN03',N'Bàn 3',1);

select * from HoaDon
select * from HoaDonChiTiet
SELECT CONVERT(time, GETDATE()) AS CurrentTime;

select * from ChiTietBanChoi
select * from HoaDonChiTiet
select * from HoaDon


select maHD,ngayTao,ngayThanhToan,tongTien from HoaDon
insert into HoaDon(maHD,ngayTao,ngayThanhToan,tongTien)values('HD01','2023-04-11','2023-04-11',300000)
select bc.tenBan, dv.ten, ctbc.soLuong, dv.gia from HoaDonChiTiet hdct join HoaDon hd on hdct.idHD = hd.id join BanChoi bc on bc.id = hdct.idBan join ChiTietBanChoi ctbc on ctbc.idBan = bc.id join DichVu dv on ctbc.idDV = dv.id
SELECT * FROM NhanVien



select * from DichVu
insert into DichVu(ma,ten,gia,loaiDV,soLuong,tinhTrang)values ('DV01','CocaCola',10000,N'nuoc',10,1);
insert into DichVu(ma,ten,gia,loaiDV,soLuong,tinhTrang)values ('DV02',N'Bánh ngọt',10000,N'Đồ ăn',100,1);
insert into DichVu(ma,ten,gia,loaiDV,soLuong,tinhTrang)values ('DV03',N'Gay bida giup ban hay',200000,N'gay',100,1);


select * from DichVu

select * from ChiTietBanChoi
select * from CoSoVatChat
select * from BanChoi
insert into BanChoi(maBan,tenBan,gia,TGBD,TGKT,idCSVC,tienBan,tinhTrang)values('BAN01',N'Bàn 1','100000','4/4/2023 10:51:50','4/4/2023 16:51:50',4,2000000,1)
select * from HoaDon
select * from HoaDonChiTiet
insert into ChiTietBanChoi(idDV, idBan, gia, tinhTrang, soLuong) values(1, 4, 15000, 1, 2)
insert into ChiTietBanChoi(idDV, idBan, gia, tinhTrang, soLuong) values(2, 4, 15000, 1, 2)

insert into HoaDonChiTiet(idHD, idBan, tinhTrang) values(1, 4,1)

select * from KhachHang
insert into KhachHang(ma,ten,gioiTinh,ngaySinh,diaChi,sdt,diemTichLuy,soCMT,tinhTrang,email) values ('KH02','Nguyen Thi B',1,'2002-01-01','Ha Noi',0999999999,0,122421873,1,'sangntph25623@fpt.edu.vn')
insert into KhachHang(ma,ten,gioiTinh,ngaySinh,diaChi,sdt,diemTichLuy,soCMT,tinhTrang,email) values ('KH03','Nguyen Thi C',0,'2002-01-01','Ha Noi',0999999999,0,122421873,1,'hungvvph17020@fpt.edu.vn')





select dbo.HoaDon.maHD, dbo.BanChoi.tenBan, dbo.DichVu.ten, dbo.ChiTietBanChoi.soLuong, dbo.DichVu.gia from dbo.HoaDonChiTiet join dbo.HoaDon 
on dbo.HoaDonChiTiet.idHD = dbo.HoaDon.id join dbo.BanChoi on dbo.BanChoi.id = dbo.HoaDonChiTiet.idBan join dbo.ChiTietBanChoi 
on dbo.ChiTietBanChoi.idBan = dbo.BanChoi.id join dbo.DichVu on dbo.ChiTietBanChoi.idDV = dbo.DichVu.id where dbo.HoaDon.id=1



select id from HoaDon where maHD='HD01' 

 
 select dbo.HoaDon.maHD, dbo.BanChoi.tenBan, dbo.DichVu.ten, dbo.ChiTietBanChoi.soLuong, dbo.DichVu.gia from dbo.HoaDonChiTiet join dbo.HoaDon 
on dbo.HoaDonChiTiet.idHD = dbo.HoaDon.id join dbo.BanChoi on dbo.BanChoi.id = dbo.HoaDonChiTiet.idBan join dbo.ChiTietBanChoi 
on dbo.ChiTietBanChoi.idBan = dbo.BanChoi.id join dbo.DichVu on dbo.ChiTietBanChoi.idDV = dbo.DichVu.id where dbo.HoaDon.id=1

select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon
select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon where NGAYTAO between '2022-02-02' and  '2024-02-22' order by NGAYTAO



select dbo.HoaDon.maHD,dbo.HoaDon.tongTien,dbo.HoaDon.tienSauKM,dbo.HoaDon.ngayTao,dbo.HoaDon.ngayThanhToan,dbo.HoaDon.tienKhachDua,
(dbo.HoaDon.tongTien-dbo.HoaDon.tienKhachDua)as tienThua,(dbo.DichVu.gia*dbo.ChiTietBanChoi.soLuong)as tongTienDV, dbo.BanChoi.tenBan,
dbo.DichVu.ten, dbo.ChiTietBanChoi.soLuong, dbo.DichVu.gia from dbo.HoaDonChiTiet join dbo.HoaDon
on dbo.HoaDonChiTiet.idHD = dbo.HoaDon.id join dbo.BanChoi on dbo.BanChoi.id = dbo.HoaDonChiTiet.idBan join dbo.ChiTietBanChoi 
on dbo.ChiTietBanChoi.idBan = dbo.BanChoi.id join dbo.DichVu on dbo.ChiTietBanChoi.idDV = dbo.DichVu.id where dbo.HoaDon.id=1


select * from NhanVien
insert into NhanVien(ma,matKhau)values('NV01','qa02')



select dbo.HoaDon.maHD,dbo.HoaDon.tongTien,dbo.HoaDon.tienSauKM,dbo.HoaDon.ngayTao,dbo.HoaDon.ngayThanhToan,dbo.HoaDon.tienKhachDua,
(dbo.HoaDon.tienKhachDua-dbo.HoaDon.tienSauKM)as tienThua,(dbo.DichVu.gia*dbo.ChiTietBanChoi.soLuong)as tongTienDV, dbo.BanChoi.tenBan,
dbo.DichVu.ten, dbo.ChiTietBanChoi.soLuong, dbo.DichVu.gia from dbo.HoaDonChiTiet join dbo.HoaDon
on dbo.HoaDonChiTiet.idHD = dbo.HoaDon.id join dbo.BanChoi on dbo.BanChoi.id = dbo.HoaDonChiTiet.idBan join dbo.ChiTietBanChoi 
on dbo.ChiTietBanChoi.idBan = dbo.BanChoi.id join dbo.DichVu on dbo.ChiTietBanChoi.idDV = dbo.DichVu.id where dbo.HoaDon.id=1