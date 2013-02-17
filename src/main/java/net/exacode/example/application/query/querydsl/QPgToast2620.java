package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2620 is a Querydsl query type for QPgToast2620
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2620 extends com.mysema.query.sql.RelationalPathBase<QPgToast2620> {

    private static final long serialVersionUID = -8643282;

    public static final QPgToast2620 pgToast2620 = new QPgToast2620("pg_toast_2620");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2620> pgToast2620Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2620(String variable) {
        super(QPgToast2620.class, forVariable(variable), "pg_toast", "pg_toast_2620");
    }

    @SuppressWarnings("all")
    public QPgToast2620(Path<? extends QPgToast2620> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2620");
    }

    public QPgToast2620(PathMetadata<?> metadata) {
        super(QPgToast2620.class, metadata, "pg_toast", "pg_toast_2620");
    }

}

