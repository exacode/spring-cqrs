package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast1255Index is a Querydsl query type for QPgToast1255Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast1255Index extends com.mysema.query.sql.RelationalPathBase<QPgToast1255Index> {

    private static final long serialVersionUID = -1867058523;

    public static final QPgToast1255Index pgToast1255Index = new QPgToast1255Index("pg_toast_1255_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast1255Index(String variable) {
        super(QPgToast1255Index.class, forVariable(variable), "pg_toast", "pg_toast_1255_index");
    }

    @SuppressWarnings("all")
    public QPgToast1255Index(Path<? extends QPgToast1255Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_1255_index");
    }

    public QPgToast1255Index(PathMetadata<?> metadata) {
        super(QPgToast1255Index.class, metadata, "pg_toast", "pg_toast_1255_index");
    }

}

