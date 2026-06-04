CREATE TABLE account
(
    uid      BIGSERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255)       NOT NULL,
    is_sell  INTEGER            NOT NULL DEFAULT 0,
    is_admin INTEGER            NOT NULL DEFAULT 0,
    fullname VARCHAR(100),
    phone    VARCHAR(20),
    email    VARCHAR(100),
    city     VARCHAR(100),
    district VARCHAR(100),
    ward     VARCHAR(100)
);

CREATE TABLE category
(
    cid   BIGSERIAL PRIMARY KEY,
    cname VARCHAR(100) NOT NULL
);

CREATE TABLE brand
(
    bid   BIGSERIAL PRIMARY KEY,
    bname VARCHAR(100) NOT NULL
);

CREATE TABLE size
(
    sid   BIGSERIAL PRIMARY KEY,
    sname VARCHAR(20) NOT NULL
);

CREATE TABLE product
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    image       TEXT,
    cost        INTEGER      NOT NULL,
    sale        INTEGER      NOT NULL DEFAULT 0,
    price       INTEGER      NOT NULL,
    quantity    INTEGER      NOT NULL DEFAULT 0,
    title       VARCHAR(255),
    description TEXT,

    cateid      BIGINT       NOT NULL,
    brandid     BIGINT,
    sell_id     BIGINT,

    CONSTRAINT fk_product_category
        FOREIGN KEY (cateid)
            REFERENCES category (cid),

    CONSTRAINT fk_product_brand
        FOREIGN KEY (brandid)
            REFERENCES brand (bid),

    CONSTRAINT fk_product_account
        FOREIGN KEY (sell_id)
            REFERENCES account (uid)
);

CREATE TABLE cart
(
    aid      BIGINT  NOT NULL,
    pid      BIGINT  NOT NULL,
    quantity INTEGER NOT NULL DEFAULT 1,

    CONSTRAINT fk_cart_account
        FOREIGN KEY (aid)
            REFERENCES account (uid),

    CONSTRAINT fk_cart_product
        FOREIGN KEY (pid)
            REFERENCES product (id)
);

CREATE TABLE bill
(
    bill_id   BIGSERIAL PRIMARY KEY,

    acc_id    BIGINT,

    fullname  VARCHAR(100),

    total     INTEGER,

    phone1    VARCHAR(20),
    phone2    VARCHAR(20),

    city      VARCHAR(100),
    district  VARCHAR(100),
    ward      VARCHAR(100),

    desbill   TEXT,

    bill_date DATE    DEFAULT CURRENT_DATE,

    status    INTEGER DEFAULT 1,

    CONSTRAINT fk_bill_account
        FOREIGN KEY (acc_id)
            REFERENCES account (uid)
);

CREATE TABLE billdetail
(
    billdetail_id BIGSERIAL PRIMARY KEY,

    bill_id       BIGINT  NOT NULL,

    pid           BIGINT  NOT NULL,

    pname         VARCHAR(255),

    quantity      INTEGER NOT NULL,

    subtotal      INTEGER NOT NULL,

    detail_date   DATE DEFAULT CURRENT_DATE,

    CONSTRAINT fk_billdetail_bill
        FOREIGN KEY (bill_id)
            REFERENCES bill (bill_id),

    CONSTRAINT fk_billdetail_product
        FOREIGN KEY (pid)
            REFERENCES product (id)
);

CREATE TABLE comment
(
    comment_id          BIGSERIAL PRIMARY KEY,

    comment_pid         BIGINT NOT NULL,

    comment_aid         BIGINT NOT NULL,

    comment_user        VARCHAR(100),

    comment_description TEXT,

    comment_star        INTEGER CHECK (comment_star BETWEEN 1 AND 5),

    comment_date        DATE DEFAULT CURRENT_DATE,

    CONSTRAINT fk_comment_product
        FOREIGN KEY (comment_pid)
            REFERENCES product (id),

    CONSTRAINT fk_comment_account
        FOREIGN KEY (comment_aid)
            REFERENCES account (uid)
);

CREATE INDEX idx_product_category ON product (cateid);
CREATE INDEX idx_product_brand ON product (brandid);
CREATE INDEX idx_product_sellid ON product (sell_id);

CREATE INDEX idx_bill_account ON bill (acc_id);

CREATE INDEX idx_comment_product ON comment (comment_pid);