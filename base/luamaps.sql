--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: comentario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comentario (
    idcomentario integer NOT NULL,
    calificacion integer,
    descripcion character varying(100) NOT NULL,
    correo character varying(40) NOT NULL,
    idmarcador integer NOT NULL
);


ALTER TABLE public.comentario OWNER TO postgres;

--
-- Name: comentario_idcomentario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.comentario_idcomentario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.comentario_idcomentario_seq OWNER TO postgres;

--
-- Name: comentario_idcomentario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.comentario_idcomentario_seq OWNED BY public.comentario.idcomentario;


--
-- Name: marcador; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.marcador (
    idmarcador integer NOT NULL,
    descripcion character varying(100) NOT NULL,
    latitud double precision NOT NULL,
    longitud double precision NOT NULL,
    idtema integer NOT NULL
);


ALTER TABLE public.marcador OWNER TO postgres;

--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.marcador_idmarcador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.marcador_idmarcador_seq OWNER TO postgres;

--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.marcador_idmarcador_seq OWNED BY public.marcador.idmarcador;


--
-- Name: megusta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.megusta (
    idmegusta integer NOT NULL,
    valor bit(1),
    correo character varying(40) NOT NULL,
    idcomentario integer NOT NULL
);


ALTER TABLE public.megusta OWNER TO postgres;

--
-- Name: megusta_idmegusta_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.megusta_idmegusta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.megusta_idmegusta_seq OWNER TO postgres;

--
-- Name: megusta_idmegusta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.megusta_idmegusta_seq OWNED BY public.megusta.idmegusta;


--
-- Name: tema; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tema (
    idtema integer NOT NULL,
    nombretema character varying(60) NOT NULL,
    color character varying(10) NOT NULL,
    correo character varying(40) NOT NULL
);


ALTER TABLE public.tema OWNER TO postgres;

--
-- Name: tema_idtema_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tema_idtema_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tema_idtema_seq OWNER TO postgres;

--
-- Name: tema_idtema_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tema_idtema_seq OWNED BY public.tema.idtema;


--
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    correo character varying(40) NOT NULL,
    activo boolean DEFAULT true,
    nombreusuario character varying(50) NOT NULL,
    rol integer NOT NULL,
    contrasenia character varying(10) NOT NULL
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- Name: comentario idcomentario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comentario ALTER COLUMN idcomentario SET DEFAULT nextval('public.comentario_idcomentario_seq'::regclass);


--
-- Name: marcador idmarcador; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcador ALTER COLUMN idmarcador SET DEFAULT nextval('public.marcador_idmarcador_seq'::regclass);


--
-- Name: megusta idmegusta; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.megusta ALTER COLUMN idmegusta SET DEFAULT nextval('public.megusta_idmegusta_seq'::regclass);


--
-- Name: tema idtema; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tema ALTER COLUMN idtema SET DEFAULT nextval('public.tema_idtema_seq'::regclass);


--
-- Data for Name: comentario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comentario (idcomentario, calificacion, descripcion, correo, idmarcador) FROM stdin;
\.


--
-- Data for Name: marcador; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.marcador (idmarcador, descripcion, latitud, longitud, idtema) FROM stdin;
\.


--
-- Data for Name: megusta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.megusta (idmegusta, valor, correo, idcomentario) FROM stdin;
\.


--
-- Data for Name: tema; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tema (idtema, nombretema, color, correo) FROM stdin;
\.


--
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuario (correo, activo, nombreusuario, rol, contrasenia) FROM stdin;
\.


--
-- Name: comentario_idcomentario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comentario_idcomentario_seq', 1, false);


--
-- Name: marcador_idmarcador_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marcador_idmarcador_seq', 1, false);


--
-- Name: megusta_idmegusta_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.megusta_idmegusta_seq', 1, false);


--
-- Name: tema_idtema_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tema_idtema_seq', 1, false);


--
-- Name: comentario comentario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comentario
    ADD CONSTRAINT comentario_pkey PRIMARY KEY (idcomentario);


--
-- Name: marcador marcador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcador
    ADD CONSTRAINT marcador_pkey PRIMARY KEY (idmarcador);


--
-- Name: megusta megusta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.megusta
    ADD CONSTRAINT megusta_pkey PRIMARY KEY (idmegusta);


--
-- Name: tema tema_color_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tema
    ADD CONSTRAINT tema_color_key UNIQUE (color);


--
-- Name: tema tema_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tema
    ADD CONSTRAINT tema_pkey PRIMARY KEY (idtema);


--
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (correo);


--
-- Name: comentario comentario_correo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comentario
    ADD CONSTRAINT comentario_correo_fkey FOREIGN KEY (correo) REFERENCES public.usuario(correo) ON UPDATE CASCADE;


--
-- Name: comentario comentario_idmarcador_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comentario
    ADD CONSTRAINT comentario_idmarcador_fkey FOREIGN KEY (idmarcador) REFERENCES public.marcador(idmarcador) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: marcador marcador_idtema_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcador
    ADD CONSTRAINT marcador_idtema_fkey FOREIGN KEY (idtema) REFERENCES public.tema(idtema) ON UPDATE CASCADE;


--
-- Name: megusta megusta_correo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.megusta
    ADD CONSTRAINT megusta_correo_fkey FOREIGN KEY (correo) REFERENCES public.usuario(correo) ON UPDATE CASCADE;


--
-- Name: megusta megusta_idcomentario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.megusta
    ADD CONSTRAINT megusta_idcomentario_fkey FOREIGN KEY (idcomentario) REFERENCES public.comentario(idcomentario) ON UPDATE CASCADE;


--
-- Name: tema tema_correo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tema
    ADD CONSTRAINT tema_correo_fkey FOREIGN KEY (correo) REFERENCES public.usuario(correo) ON UPDATE CASCADE;


--
-- PostgreSQL database dump complete
--

