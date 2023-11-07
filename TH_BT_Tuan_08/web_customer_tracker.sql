USE [master]
GO

/****** Object:  Database [web_customer_tracker]    Script Date: 11/6/2023 10:38:58 AM ******/
CREATE DATABASE [web_customer_tracker]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'web_customer_tracker', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\web_customer_tracker.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'web_customer_tracker_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\web_customer_tracker_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [web_customer_tracker] SET COMPATIBILITY_LEVEL = 110
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [web_customer_tracker].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ARITHABORT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_CREATE_STATISTICS ON 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [web_customer_tracker] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [web_customer_tracker] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [web_customer_tracker] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [web_customer_tracker] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET  DISABLE_BROKER 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [web_customer_tracker] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [web_customer_tracker] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [web_customer_tracker] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [web_customer_tracker] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [web_customer_tracker] SET RECOVERY FULL 
GO

ALTER DATABASE [web_customer_tracker] SET  MULTI_USER 
GO

ALTER DATABASE [web_customer_tracker] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [web_customer_tracker] SET DB_CHAINING OFF 
GO

ALTER DATABASE [web_customer_tracker] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [web_customer_tracker] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO

ALTER DATABASE [web_customer_tracker] SET  READ_WRITE 
GO

USE [web_customer_tracker]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 18/09/2023 9:34:04 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[customer](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FIRST_NAME] [nvarchar](50) NULL,
	[LAST_NAME] [nvarchar](50) NULL,
	[EMAIL] [nvarchar](50) NULL,
) ON [PRIMARY]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
SET IDENTITY_INSERT [dbo].[customer] ON 

INSERT [dbo].[customer] ([ID], [FIRST_NAME], [LAST_NAME], [EMAIL]) VALUES (1, N'Thanh Van', N'Anh', N'thanhvananh@gmail.com')
INSERT [dbo].[customer] ([ID], [FIRST_NAME], [LAST_NAME], [EMAIL]) VALUES (2, N'Nguyen Minh', N'Long', N'nguyenminhlong@gmail.com')
INSERT [dbo].[customer] ([ID], [FIRST_NAME], [LAST_NAME], [EMAIL]) VALUES (3, N'Luong', N'Hoang', N'luonghoang@gmail.com')
INSERT [dbo].[customer] ([ID], [FIRST_NAME], [LAST_NAME], [EMAIL]) VALUES (4, N'Hien', N'Minh', N'hienminh@gmail.com')
INSERT [dbo].[customer] ([ID], [FIRST_NAME], [LAST_NAME], [EMAIL]) VALUES (5, N'Hoang', N'Hung', N'hoanghung@gmail.com')
SET IDENTITY_INSERT [dbo].[customer] OFF

USE [master]
GO
ALTER DATABASE [web_customer_tracker] SET  READ_WRITE 
GO