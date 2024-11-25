-- noinspection SqlDialectInspectionForFile

-- noinspection SqlDialectInspectionForFile

DELETE FROM oferta;
DELETE FROM rubro;

INSERT INTO rubro (id, nombre, activo, fecha_y_hora_alta, fecha_y_hora_modificado)
VALUES
('00000000-0000-0000-0000-000000000001', 'tecnología', 1, NOW(), NOW());

INSERT INTO oferta (id, nombre, pathImagen, cantidad_de_puntos_necesarios_para_acceder_al_beneficio, rubro_id, activo, fecha_y_hora_alta, fecha_y_hora_modificado)
VALUES
    ('00000000-0000-0000-0000-000000000001', 'Beat Solo3 Wireless', 'https://raw.githubusercontent.com/rxhack/productImage/main/2.jpg', 20000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000002', 'Nike Air Max 270', 'https://raw.githubusercontent.com/rxhack/productImage/main/3.jpg', 15000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000003', 'Samsung Galaxy S21', 'https://raw.githubusercontent.com/rxhack/productImage/main/4.jpg', 25000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000004', 'Apple Watch Series 6', 'https://raw.githubusercontent.com/rxhack/productImage/main/2.jpg', 30000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000005', 'Sony WH-1000XM4', 'https://raw.githubusercontent.com/rxhack/productImage/main/3.jpg', 22000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000006', 'Dell XPS 13', 'https://raw.githubusercontent.com/rxhack/productImage/main/4.jpg', 40000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000007', 'Canon EOS Rebel T7', 'https://raw.githubusercontent.com/rxhack/productImage/main/2.jpg', 35000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000008', 'Fitbit Charge 4', 'https://raw.githubusercontent.com/rxhack/productImage/main/3.jpg', 18000, 1, 1, NOW(), NOW()),
    ('00000000-0000-0000-0000-000000000009', 'GoPro HERO9 Black', 'https://raw.githubusercontent.com/rxhack/productImage/main/4.jpg', 45000, 1, 1, NOW(), NOW());
