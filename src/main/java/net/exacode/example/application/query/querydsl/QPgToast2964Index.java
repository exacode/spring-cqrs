package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2964Index is a Querydsl query type for QPgToast2964Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2964Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2964Index> {

    private static final long serialVersionUID = 794099297;

    public static final QPgToast2964Index pgToast2964Index = new QPgToast2964Index("pg_toast_2964_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2964Index(String variable) {
        super(QPgToast2964Index.class, forVariable(variable), "pg_toast", "pg_toast_2964_index");
    }

    @SuppressWarnings("all")
    public QPgToast2964Index(Path<? extends QPgToast2964Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2964_index");
    }

    public QPgToast2964Index(PathMetadata<?> metadata) {
        super(QPgToast2964Index.class, metadata, "pg_toast", "pg_toast_2964_index");
    }

}

