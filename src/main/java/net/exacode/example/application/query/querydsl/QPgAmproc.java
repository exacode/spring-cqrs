package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmproc is a Querydsl query type for QPgAmproc
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmproc extends com.mysema.query.sql.RelationalPathBase<QPgAmproc> {

    private static final long serialVersionUID = 186595485;

    public static final QPgAmproc pgAmproc = new QPgAmproc("pg_amproc");

    public final SimplePath<Object> amproc = createSimple("amproc", Object.class);

    public final NumberPath<Long> amprocfamily = createNumber("amprocfamily", Long.class);

    public final NumberPath<Long> amproclefttype = createNumber("amproclefttype", Long.class);

    public final NumberPath<Short> amprocnum = createNumber("amprocnum", Short.class);

    public final NumberPath<Long> amprocrighttype = createNumber("amprocrighttype", Long.class);

    public QPgAmproc(String variable) {
        super(QPgAmproc.class, forVariable(variable), "pg_catalog", "pg_amproc");
    }

    @SuppressWarnings("all")
    public QPgAmproc(Path<? extends QPgAmproc> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amproc");
    }

    public QPgAmproc(PathMetadata<?> metadata) {
        super(QPgAmproc.class, metadata, "pg_catalog", "pg_amproc");
    }

}

